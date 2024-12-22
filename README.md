# Quiz Management System

## Demo Video
*(https://drive.google.com/file/d/15fXdyLe2MVQ7DiZx4sU9Farg3xeNU6FN/view?usp=sharing)*


## Project Overview

This project is a simple **Quiz Management System** that allows an admin to create and manage a question bank of multiple-choice questions (MCQs) and enables students to take quizzes based on these questions. The system is designed to handle two user roles: **Admin** and **Student**, each with specific functionalities.

### Key Features:

1. **Admin Functionalities:**

   - Login using credentials.
   - Add multiple MCQs to the question bank.
   - Save MCQs to a `quiz.json` file for persistent storage.
   - Exit the system after completing tasks.

2. **Student Functionalities:**

   - Login using credentials.
   - Take a quiz of 10 random questions.
   - Each question is evaluated against the correct answer stored in the `quiz.json` file.
   - Display the final result and a performance message based on the score.

3. **File-based Data Storage:**

   - User credentials are stored in `users.json`.
   - Questions are stored in `quiz.json`.


### Admin Workflow

1. Log in as an admin.
2. Add new MCQs by following prompts.
3. Save questions in `quiz.json`.
4. Exit by pressing `q`.

### Student Workflow

1. Log in as a student.
2. Take a 10-question quiz.
3. Receive a final score and performance message.
4. Choose to retake the quiz or exit.

## Result Evaluation Criteria

- **Score >= 8**: Excellent! You have got [marks] out of 10.
- **Score >= 5 and < 8**: Good. You have got [marks] out of 10.
- **Score >= 2 and < 5**: Very poor! You have got [marks] out of 10.
- **Score < 2**: Very sorry you are failed. You have got [marks] out of 10.



