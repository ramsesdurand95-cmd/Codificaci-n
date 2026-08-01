import Foundation

// Función principal para mostrar el menú y gestionar las opciones
func ejecutarMenuAreas() {
    print("Menu de areas")
    print("1- Area del cuadrado")
    print("2- Area del rectangulo")
    print("3- Area del triangulo")
    print("4- Area del ciruclo")
    print("Por favor introduce una opcion (numero): ", terminator: "")
    
    // Lectura de la opción ingresada por el usuario
    if let entrada = readLine(), let opcion = Int(entrada) {
        switch opcion {
        case 1:
            print("Introduce el valor del lado: ", terminator: "")
            if let ladoStr = readLine(), let lado = Float(ladoStr) {
                let area = lado * lado
                print(String(format: "El area del cuadrado es: %.6f", area))
            }
            
        case 2:
            print("Introduce el valor del lado 1: ", terminator: "")
            if let lado1Str = readLine(), let lado1 = Float(lado1Str) {
                print("Introduce el valor del lado 2: ", terminator: "")
                if let lado2Str = readLine(), let lado2 = Float(lado2Str) {
                    let area = lado1 * lado2
                    print(String(format: "El area del rectangulo es: %.6f", area))
                }
            }
            
        case 3:
            print("Introduce el valor de la base: ", terminator: "")
            if let baseStr = readLine(), let base = Float(baseStr) {
                print("Introduce el valor de la altura: ", terminator: "")
                if let alturaStr = readLine(), let altura = Float(alturaStr) {
                    let area = (base * altura) / 2.0
                    print(String(format: "El area del triangulo es: %.6f", area))
                }
            }
            
        case 4:
            print("Introduce el valor del radio: ", terminator: "")
            if let radioStr = readLine(), let radio = Float(radioStr) {
                // Utilizando 3.14 en Float para replicar la precisión exacta del ejemplo
                let pi: Float = 3.14
                let area = pi * (radio * radio)
                print(String(format: "El area del circulo es: %.6f", area))
            }
            
        default:
            print("Opcion no valida.")
        }
    } else {
        print("Entrada incorrecta. Por favor ingresa un numero.")
    }
}

// Ejecución del programa
ejecutarMenuAreas()
