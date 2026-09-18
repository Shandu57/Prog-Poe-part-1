# Prog-Poe-part-1
Registration chats
# CONVOS Part 1 - My Version

## Programming 1A: Registration and Login

This is my own console-based implementation of Part 1 of the CONVOS Programming 1A project.

### What the application does

The program:
1. Collects the user's first name and last name.
2. Collects a username, password and South African cell phone number.
3. Validates the username.
4. Validates password complexity.
5. Validates the cell phone number.
6. Completes registration only when all required details are valid.
7. Allows the registered user to log in.
8. Displays the required success or error login message.

### My demonstration details

For my own demonstration I can use:

- Valid username: `Shan_5`
- Invalid username: `Shandukani_5`
- Valid password: `John@571`
- Invalid password: `johnfoster@571`
- Valid cell number: `+27838968976`
- Invalid cell number: `08966553`

The POE-specified unit-test values are also included in `LoginTest.java`.

### Required validation rules

Username:
- Must contain an underscore.
- Must be no more than five characters.

Password:
- At least eight characters.
- At least one uppercase letter.
- At least one number.
- At least one special character.

Cell phone:
- Uses the South African `+27` international format.
- The regular expression is documented in `Login.java`.

### Main files

- `RegistrationSystemPOEPart1.java` - console application.
- `Login.java` - validation, registration and login logic.
- `LoginTest.java` - JUnit 5 unit tests.

## Running

Open the project in NetBeans and run `RegistrationSystemPOEPart1.java`.

The project is deliberately console-based and does not use `JOptionPane` or Swing for the Part 1 application.

## Personal demonstration

The console wording and test demonstration are arranged to make the program easy for me to explain in my presentation.
