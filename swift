import Foundation

// 1. Estructura para definir qué es un Artículo
struct Articulo {
    var nombre: String
    var cantidad: Int
}

// 2. Arreglo (Lista) para guardar el inventario
var inventario: [Articulo] = []
var salir = false

// 3. Ciclo principal del Menú
while !salir {
    print("\nMENU")
    print("1. Registrar articulos.")
    print("2. Ver lista de articulos.")
    print("3. Consultar articulos en existencias.")
    print("4. Salir.")
    print("\nElige una opcion (numero): ", terminator: "")
    
    // Leemos la opción del usuario
    if let opcionStr = readLine(), let opcion = Int(opcionStr) {
        
        switch opcion {
        case 1:
            print("\n1. Registrar articulo")
            print("Por favor escriba la cantidad de articulos que desea ingresar: ", terminator: "")
            
            if let cantStr = readLine(), let cantidadIngresar = Int(cantStr) {
                // Ciclo para registrar la cantidad de artículos solicitada
                for i in 1...cantidadIngresar {
                    print("\nRegistro de articulos")
                    print("Ingrese el nombre del articulo, posteriormente presione enter:")
                    print("Articulo \(i) ", terminator: "")
                    let nombre = readLine() ?? "Desconocido"
                    
                    print("Ingrese la cantidad de este articulo:")
                    print("Cantidad \(i) ", terminator: "")
                    let cantidadArticulo = Int(readLine() ?? "0") ?? 0
                    
                    // Guardamos el artículo en el inventario
                    let nuevoArticulo = Articulo(nombre: nombre, cantidad: cantidadArticulo)
                    inventario.append(nuevoArticulo)
                }
            }
            
        case 2:
            print("\n2. Ver lista de articulos.")
            print("Listado de productos")
            if inventario.isEmpty {
                print("No hay articulos registrados.")
            } else {
                for (index, articulo) in inventario.enumerated() {
                    print("Articulo \(index + 1) \(articulo.nombre)")
                    print("Cantidad \(index + 1) \(articulo.cantidad)")
                }
            }
            
        case 3:
            print("\n3. Consultar articulos en existencias.")
            if inventario.isEmpty {
                print("No hay articulos en existencia.")
            } else {
                for (index, articulo) in inventario.enumerated() {
                    print("Articulo \(index + 1): \(articulo.nombre)")
                    print("Cantidad \(index + 1): \(articulo.cantidad)")
                }
            }
            
        case 4:
            salir = true
            
        default:
            print("\nOpcion no valida. Intente de nuevo.")
        }
    } else {
        print("\nEntrada no valida. Ingresa un numero.")
    }
}
