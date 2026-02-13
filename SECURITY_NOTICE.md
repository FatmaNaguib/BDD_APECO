# Security Notice

## ⚠️ Important: Credentials in Properties File

The file `src/main/java/Config/confg.properties` contains sensitive credentials (usernames and passwords) in plain text.

### Current Risk
- Credentials are stored in plain text
- File is likely tracked in version control
- Anyone with repository access can see credentials

### Recommended Actions

1. **Immediate:**
   - Add `confg.properties` to `.gitignore` if not already present
   - Create `confg.properties.example` with placeholder values
   - Document required properties in README

2. **Short-term:**
   - Move credentials to environment variables
   - Update code to read from environment variables with fallback to properties
   - Use a secrets management tool for production

3. **Long-term:**
   - Implement encrypted configuration
   - Use a secrets vault (AWS Secrets Manager, Azure Key Vault, etc.)
   - Implement credential rotation

### Example Implementation

Instead of:
```properties
username = apecouser@hotmail.com
password = P0rtal#Cqnyp
```

Use environment variables:
```java
String username = System.getenv("APECO_USERNAME");
String password = System.getenv("APECO_PASSWORD");
```

Or with fallback:
```java
String username = System.getProperty("apeco.username", 
    System.getenv("APECO_USERNAME"));
```

### Files Affected
- `src/main/java/Config/confg.properties` (lines 7-32)

---

**Note:** This is a security best practice. Even in test environments, credentials should be protected.
