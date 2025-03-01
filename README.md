# Job Management Application

This project is a simple Job Management application built using JavaServer Faces (JSF), Java Persistence API (JPA) with Hibernate, and MySQL. It allows users to create, read, update, and delete job entries.

## Technologies Used

* **JavaServer Faces (JSF):** For the user interface.
* **Java Persistence API (JPA):** For object-relational mapping.
* **Hibernate:** As the JPA provider.
* **MySQL:** As the database.
* **Maven:** For build automation and dependency management.

## Setup and Installation

1.  **Prerequisites:**
    * Java Development Kit (JDK) 8 or later
    * MySQL Server
    * A Java EE compatible application server  Tomcat 9

2.  **Clone the Repository:**

    ```bash
    git clone [repository URL]
    cd [project directory]
    ```

3.  **Configure MySQL Database:**
    * Create a database named `jobdb` in your MySQL server.
    * Update the `persistence.xml` file with your MySQL username and password.

    ```xml
    <persistence-unit name="jobPU">
        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
        <class>com.Job</class>

        <properties>
            <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/jobdb"/>
            <property name="javax.persistence.jdbc.user" value="root"/>
            <property name="javax.persistence.jdbc.password" value="1234"/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>
            <property name="hibernate.hbm2ddl.auto" value="update"/>
            <property name="hibernate.show_sql" value="true"/>
            <property name="hibernate.format_sql" value="true"/>
            <property name="hibernate.bytecode.provider" value="javassist"/>

        </properties>
    </persistence-unit>
    ```

    * Replace `root` and `1234` with your MySQL credentials.


4.  **Deploy the Application:**
    * Deploy the `.war` file (located in the `target` directory) to your application server.

5.  **Access the Application:**
    * Open your web browser and navigate to `http://localhost:8080/[your-app-context-root]/index.xhtml`.

## Usage

* **Add Job:** Enter the job name and message in the form and click "Add Job".
* **Update Job:** Enter the Job ID, name and message in the form and click "Update".
* **Delete Job:** Click the "Delete" button in the job list to remove a job.
* **View Jobs:** The job list displays all the jobs in the database.

## Dependencies

* Hibernate JPA
* Mysql Connector Java
* JSF API

## Future Improvements

* Implement better error handling and validation.
* Add pagination to the job list.
* Improve the user interface with CSS and JavaScript.
* Add more fields to the Job entity.
* Add security to the application.
* Add unit and integration tests.
