package vcmsa.ci.icetask5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun
        onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myPet = Pet("Buddy", 3)
        myPet.displayInfo()
        myPet.makeSound()
    }
        }

        class Pet(val name: String, val age: Int) {
            fun makeSound() {
                println("Woof!") // Change to "Meow!" if you want a cat instead
            }

            fun displayInfo() {
                println("Pet's name: $name, Age: $age")
            }
        }

