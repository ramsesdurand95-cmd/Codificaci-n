import Foundation

print("Por favor, ingresa un número entero:")

// Leemos la entrada del usuario y verificamos que no sea nula y sea un número entero
if let entrada = readLine(), let numero = Int(entrada) {
    
    // Evaluamos si el residuo de la división entre 2 es cero
    if numero % 2 == 0 {
        print("El número \(numero) es PAR.")
    } else {
        print("El número \(numero) es IMPAR.")
    }
    
} else {
    // Mensaje de error en caso de que el usuario no ingrese un número válido
    print("Error: No ingresaste un número entero válido.")
}
