fun main() { 
    val height =  1.7 // meters
    val weight = 80 // kilograms
    
    printIn ("Height: $height meters")
    printIn ("Weight: $weight kg)
    printIn ()
    
    val bmi = weight / (height * height)
    printIn ("BMI = %3f".format (bmi))
    
    if (bmi <=18.5 )
    print ("Underweight.")
    else if (bmi <= 25)
    print ("Optimal.")
    else 
    print ("Obese.")
