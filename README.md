A repository of Data Structures & Algorithms (DSA) problems and solutions in Java and Kotlin.

🌟 Why this repo

Provides a clean, structured collection of DSA problems and their working solutions.

Helps you quickly review and practice common data structures and algorithms — good for interview preparation, competitive coding, or general learning.

Supports both Java and Kotlin (mixed codebase), giving flexibility depending on your language preference.

📂 Repository Structure
nano-dsa/
  ├── src/
  │     └── main/        # Source code folder
  │         ├── java/    # Solutions in Java
  │         └── kotlin/  # Solutions (or utilities/tests) in Kotlin
  ├── pom.xml            # Maven build configuration
  ├── .gitignore
  └── README.md          # This file


Use src/main/java for Java-based solutions.

Use src/main/kotlin for Kotlin-based solutions.

You can add subfolders inside java/ or kotlin/ (e.g. arrays/, graphs/, dynamic-programming/) to organize problems by category for better navigation.

🚀 How to build / run

Since this is a Maven-based project:

# To build the project
mvn clean compile

# To run a particular class (if it has a main method)
// e.g. (assuming problem class is under package `com.example`)
mvn exec:java -Dexec.mainClass="com.example.YourClassName"


Alternatively, import the project into your preferred IDE (e.g. IntelliJ IDEA) — Maven will automatically resolve dependencies (Kotlin stdlib, etc.), and you can run individual solutions directly from the IDE.

✅ How to add new problems / solutions

Navigate to either src/main/java or src/main/kotlin, depending on the language you prefer.

(Optional) Create a sub-directory under a category (for example arrays, graphs, dp, etc.).

Add your solution file — ensure file naming is sensible (for readability), and include a main method (or relevant test) if you wish to run or test it.

Commit and push — your problem and solution will now be part of the shared collection.

⭐ Why contribute

Helps keep a curated, ready-to-use library of DSA solutions.

Makes it easier for others (or your future self) to revisit/learn DSA without starting from scratch.

Useful as a reference when preparing for coding interviews or competitive programming.

📚 Suggested Improvements / Roadmap

Add categories (packages) like arrays, strings, linked-list, trees, graphs, dynamic-programming, etc. for better organization.

Add README or index files inside each category explaining the topic and summarizing the problems implemented.

Add unit tests or sample input/output for each solution to validate correctness.

Optionally add performance metrics (time/space complexity) as comments in solution files.

Track problem sources (LeetCode, GeeksforGeeks, custom problems) — helpful for reference.
