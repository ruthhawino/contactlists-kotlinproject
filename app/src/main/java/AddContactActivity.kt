import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AddContactActivity : AppCompatActivity() {
    private var nameEditText: EditText? = null
    private var phoneEditText: EditText? = null
    private var emailEditText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)
        nameEditText = findViewById<EditText>(R.id.editTextName)
        phoneEditText = findViewById<EditText>(R.id.editTextPhone)
        emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val saveButton = findViewById<Button>(R.id.buttonSave)
        saveButton.setOnClickListener { saveContact() }
    }

    private fun saveContact() {
        val name = nameEditText!!.text.toString().trim { it <= ' ' }
        val phone = phoneEditText!!.text.toString().trim { it <= ' ' }
        val email = emailEditText!!.text.toString().trim { it <= ' ' }
        if (name.isEmpty()) {
            nameEditText!!.error = "Please enter a name"
            return
        }

        // Perform other validations as per your requirements

        // All validations pass, create a new Contact object
        val newContact = Contact()
        // Save the contact to the local database
        // Example using a hypothetical ContactDatabase class
        val contact = ContactDatabase.getInstance().saveContact(newContact)
        Toast.makeText(this, "Contact saved successfully", Toast.LENGTH_SHORT).show()
        finish() // Finish the activity and return to the main contact list
    }

    private fun Contact() = Unit

}