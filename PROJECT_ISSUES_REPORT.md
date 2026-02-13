# BDD APECO Project - Current Issues Report

**Generated:** $(date)  
**Project:** BDD_APECO  
**Framework:** Cucumber + TestNG + Selenium

---

## 🔴 Critical Issues (Must Fix)

### 1. **Hardcoded Single Feature File Path**
**Location:** `src/main/java/Runner/TestRunner.java:13`
- **Issue:** Only one feature file is configured: `InitialApproval.feature`
- **Impact:** Cannot run all feature files without code changes
- **Current Code:**
```13:13:src/main/java/Runner/TestRunner.java
		features = "./src/main/resources/Features/InitialApproval.feature",
```
- **Recommendation:** Change to directory path:
```java
features = "./src/main/resources/Features",
```

### 2. **Hardcoded Test Tag**
**Location:** `src/main/java/Runner/TestRunner.java:15`
- **Issue:** Tag `@UserLogin` is hardcoded
- **Impact:** Cannot run different test suites without modifying code
- **Current Code:**
```15:15:src/main/java/Runner/TestRunner.java
		tags = "@UserLogin",
```
- **Recommendation:** Use system property:
```java
tags = System.getProperty("cucumber.filter.tags", "@UserLogin"),
```

### 3. **Security: Credentials in Properties File**
**Location:** `src/main/java/Config/confg.properties`
- **Issue:** Usernames and passwords are stored in plain text in version control
- **Impact:** Security vulnerability - credentials exposed in repository
- **Affected Lines:** Lines 7-32 contain multiple credentials
- **Recommendation:** 
  - Move credentials to environment variables
  - Add `confg.properties` to `.gitignore`
  - Use encrypted configuration or secrets management

### 4. **Package Name Typo**
**Location:** `src/main/java/AdminPortaPageslLocators/` (directory name)
- **Issue:** Package name has typo: "AdminPortaPageslLocators" (missing 'l' in Portal, extra 'l' at end)
- **Impact:** Inconsistent naming, confusion
- **Recommendation:** Rename to `AdminPortalPagesLocators`

### 5. **Test Files Should Be Removed**
**Location:** Multiple test files found
- **Issue:** Test/dummy files present in production code:
  - `src/main/java/StepDefinitions/test.java`
  - `src/main/java/StepDefinitions/zzzz.java`
- **Impact:** Code clutter, confusion
- **Recommendation:** Delete these files

---

## 🟡 Important Issues (Should Fix)

### 6. **Parallel Execution Disabled**
**Location:** `src/main/java/Runner/TestRunner.java:29`
- **Issue:** `parallel = false` in DataProvider
- **Impact:** Tests run sequentially, slower execution
- **Current Code:**
```29:29:src/main/java/Runner/TestRunner.java
	@DataProvider(parallel = false)
```
- **Recommendation:** Enable if tests are thread-safe:
```java
@DataProvider(parallel = true)
```

### 7. **Main Method in Base Class**
**Location:** `src/main/java/Bases/APECOTestBase.java:151-208`
- **Issue:** Base class contains a `main()` method with complex test execution logic
- **Impact:** Violates single responsibility principle, base class should not execute tests
- **Recommendation:** Move this logic to a dedicated test runner class

### 8. **Logic Error: Empty If Block**
**Location:** `src/main/java/Bases/APECOTestBase.java:180`
- **Issue:** Empty if block serves no purpose
- **Current Code:**
```180:180:src/main/java/Bases/APECOTestBase.java
          if (failedFile.exists() && failedFile.length() > 0) {}
```
- **Impact:** Confusing code, potential logic error
- **Recommendation:** Remove or implement proper logic

### 9. **TestNG Listener Retry Logic Issue**
**Location:** `src/main/java/Runner/TestNGListener.java:15`
- **Issue:** Execution count check may prevent legitimate reruns
- **Current Code:**
```15:17:src/main/java/Runner/TestNGListener.java
		 if (executionCount >= 3) {
	            return;  // Exit early if the method has already been executed twice
	        }
```
- **Impact:** May prevent necessary test reruns
- **Recommendation:** Make retry count configurable via properties

### 10. **Missing Null Check in Hook**
**Location:** `src/main/java/Hooks/APECOPortalHooks.java:42`
- **Issue:** Screenshot taken without checking if driver is null
- **Current Code:**
```41:44:src/main/java/Hooks/APECOPortalHooks.java
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
```
- **Impact:** Potential NullPointerException if driver initialization fails
- **Recommendation:** Add null check:
```java
if (scenario.isFailed() && driver != null) {
```

---

## 🟢 Code Quality Issues (Nice to Fix)

### 11. **Extensive Commented Code**
**Location:** Multiple files
- **Issue:** Large amounts of commented code throughout the project
- **Affected Files:**
  - `APECOTestBase.java`: Lines 237-251 (commented ChromeOptions)
  - `UserPortalPagesActions/UserServicesPageActions.java`: Multiple commented blocks
  - `UserPortalPagesLocators/InitialApplovalOwnersProfilesPageLocators.java`: Many commented locators
  - And many more...
- **Impact:** Code clutter, confusion, maintenance burden
- **Recommendation:** Remove commented code or convert to proper documentation/comments

### 12. **Inconsistent Feature File Organization**
**Location:** Multiple directories
- **Issue:** Feature files scattered across three directories:
  - `Features/` (22 files)
  - `_Features/` (13 files) 
  - `InprogressFeatures/` (42 files)
- **Impact:** Unclear which features are active, confusion about organization
- **Recommendation:** Establish clear naming conventions and organization strategy

### 13. **Commented Import Statements**
**Location:** `src/main/java/Bases/APECOTestBase.java:21,23`
- **Issue:** Commented imports suggest unused dependencies
- **Current Code:**
```21:23:src/main/java/Bases/APECOTestBase.java
//import com.google.common.io.Files;
import com.google.gson.JsonObject;
//import com.itextpdf.text.pdf.parser.Path;
```
- **Impact:** Code clutter
- **Recommendation:** Remove commented imports

### 14. **Hardcoded Paths**
**Location:** Multiple files
- **Issue:** Hardcoded file paths scattered throughout code
- **Examples:**
  - `APECOTestBase.java:214`: `"./src/main/java/Config/confg.properties"`
  - `APECOTestBase.java:153`: `"target/failedrerun.txt"`
- **Impact:** Difficult to change paths, not portable
- **Recommendation:** Use relative paths or configuration properties

### 15. **Missing Error Handling**
**Location:** Multiple hooks and step definitions
- **Issue:** Limited try-catch blocks, errors may not be properly logged
- **Impact:** Difficult debugging when failures occur
- **Recommendation:** Add comprehensive error handling with logging

### 16. **Base Class Complexity**
**Location:** `src/main/java/Bases/APECOTestBase.java`
- **Issue:** Very large class with 150+ lines of static field initialization
- **Impact:** Difficult to maintain, violates single responsibility
- **Recommendation:** Consider dependency injection or refactor into smaller modules

### 17. **Duplicate JSON Output Configuration**
**Location:** `src/main/java/Runner/TestRunner.java:18-19`
- **Issue:** Two JSON outputs configured (may be intentional for different tools)
- **Current Code:**
```17:20:src/main/java/Runner/TestRunner.java
		plugin = {
			"json:target/cucumber.json",
			"json:target/json/file.json",
			"rerun:target/failedrerun.txt"
```
- **Impact:** May be redundant
- **Recommendation:** Verify if both are needed, document purpose

---

## ✅ Positive Findings

1. ✅ **StepDefinitions package correctly included** in glue path (line 14)
2. ✅ **@After hook properly implemented** with screenshot and driver cleanup
3. ✅ **No duplicate webdrivermanager dependency** in pom.xml (analysis doc was incorrect)
4. ✅ Good use of Page Object Model pattern
5. ✅ Proper separation of locators and actions
6. ✅ Using WebDriverManager for driver management
7. ✅ TestNG integration for reporting
8. ✅ Failed test rerun capability implemented

---

## 📊 Summary Statistics

- **Total Feature Files:** 77+
- **Critical Issues:** 5
- **Important Issues:** 5
- **Code Quality Issues:** 7
- **Files with Commented Code:** 10+
- **Test Files to Remove:** 2

---

## 🎯 Recommended Priority Order

### Immediate (Critical)
1. Fix hardcoded feature file path
2. Move credentials to environment variables
3. Remove test files (test.java, zzzz.java)
4. Fix package name typo

### Short-term (Important)
5. Make tags configurable
6. Fix empty if block logic
7. Add null checks in hooks
8. Enable parallel execution (if thread-safe)

### Long-term (Code Quality)
9. Remove commented code
10. Refactor base class
11. Improve error handling
12. Organize feature files
13. Document configuration

---

## 🔧 Quick Fixes Available

Most issues can be fixed quickly:
- Feature path: 1 line change
- Tag configuration: 1 line change  
- Null check: 2 line addition
- Remove test files: Delete 2 files
- Remove commented code: Multiple files, but straightforward

---

**Note:** This report reflects the current state of the codebase. Some issues mentioned in `BDD_FRAMEWORK_ANALYSIS.md` have already been resolved (StepDefinitions in glue, @After hook implementation).
