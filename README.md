
# *HabitTrackerApp*  

**HabitTrackerApp** is  an app which allows a user to store and track their habits over time.



## Layout:

* No UI is required for this project.

## Functionality:

* The code compiles without errors.
* There exists a contract class that defines name of table and constants.  
Inside the contract class, there is an inner class for each table created.
* There exists a subclass of SQLiteOpenHelper that overrides onCreate() and onUpgrade().
* There is a single insert method that adds at least two values of two different datatypes (e.g. INTEGER, STRING) into the database using a ContentValues object and the insert() method.
* There is a single read method that returns a Cursor object. It should get the data repository in read and use the query() method to retrieve at least one column of data.
* No external libraries (e.g. Realm) are used for the database code, and no Content Providers is used. All data insertion and reading should be done using direct method calls to the SQLite database in the SQLiteOpenHelper class.


## Code Readability:

* Code is easily readable such that a fellow programmer can understand the purpose of the app.
* All variables, methods, and resource IDs are descriptively named such that another developer reading the code can easily understand their function.
* The code is properly formatted:
	* No unnecessary blank lines
	* No unused variables or methods
	* No commented out code
The code also has proper indentation when defining variables and methods.
