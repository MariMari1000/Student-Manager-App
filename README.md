
<body>

<h1>Student Manager Application</h1>

<p>Welcome to the Student Manager Application! This Java-based application provides a simple yet powerful interface for managing student records. Whether you're an educator, administrator, or student, this application helps you keep track of essential student information efficiently.</p>

<h2>Features</h2>
<h3>1. Add Student</h3>
<ul>
    <li>Add a new student to the database with their ID, first name, surname, address, and course details.</li>
    <li>Each student is uniquely identified by their ID, ensuring data integrity.</li>
</ul>

<h3>2. Delete Student</h3>
<ul>
    <li>Remove a student from the database by providing their ID.</li>
    <li>Ensures that outdated or erroneous records can be easily eliminated.</li>
</ul>

<h3>3. Search by ID</h3>
<ul>
    <li>Quickly locate a student by their unique ID.</li>
    <li>Provides instant access to detailed student information for administrative purposes.</li>
</ul>

<h3>4. Search by First Name</h3>
<ul>
    <li>Find students by their first name, facilitating efficient search and retrieval.</li>
    <li>Useful for identifying groups of students sharing the same name or conducting targeted searches.</li>
</ul>

<h3>5. Get Total Number of Students</h3>
<ul>
    <li>Retrieve the total number of students stored in the database.</li>
    <li>Offers insights into database size and student population metrics.</li>
</ul>

<h2>Usage</h2>

<p>To run the application, follow these steps:</p>
    <ol>
        <li>Ensure you have Java installed on your system.</li>
        <li>Compile the Java files using your preferred IDE or command-line compiler.</li>
        <li>Execute the <code>Runner</code> class located in the <code>ie.gmit.dip</code> package.</li>
        <li>Follow the on-screen prompts to interact with the student manager.</li>
    </ol>

    <pre><code>java ie.gmit.dip.Runner</code></pre>

<h2>Development</h2>

<p>This application is built using object-oriented programming principles and consists of the following key components:</p>

<ul>
    <li><strong>Address</strong>: Represents the address of a student.</li>
    <li><strong>Course</strong>: Represents the course in which a student is enrolled.</li>
    <li><strong>Menu</strong>: Handles the menu-driven interface for interacting with the student manager.</li>
    <li><strong>Runner</strong>: Main class to start the application.</li>
    <li><strong>Student</strong>: Represents a student with properties such as ID, name, surname, date of birth, address, and course.</li>
    <li><strong>StudentManager</strong>: Manages the storage and manipulation of student records.</li>
    <li><strong>TestRunner</strong>: Contains test cases to evaluate the functionality of the <code>StudentManager</code> class.</li>
</ul>

<h2>Testing</h2>

<p>The application includes a 
<code>TestRunner</code> class with test cases to verify the functionality of the
<code>StudentManager</code> class. Run the test cases to ensure that the application behaves as expected under various scenarios.</p>



</body>
</html>


