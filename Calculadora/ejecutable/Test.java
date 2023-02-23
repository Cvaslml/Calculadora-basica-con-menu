package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        // Declaración de variables
        double x, y;
        int opcion;
        boolean salir = false;;

        // Entrada
        JOptionPane.showMessageDialog(null, "CALCULADORA BÁSICA\n\n1. Ingrese los valores para x e y.\n2. Seleccione la operación a realizar");
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "OPERACIONES:\n\n1. Suma.\n2. Resta\n3. Multiplicacion\n4. División\n5. Potencia\n6. Logaritmo\n7. Salir"));

        // Procesamiento
        switch(opcion)
        {
            case 1:
                // Suma
                JOptionPane.showMessageDialog(null, "La suma es: " +  (x+y));
                break;
            case 2:
                // Resta
                JOptionPane.showMessageDialog(null, "La resta es: " +  (x-y));
                break;
            case 3:
                // Multiplicación
                JOptionPane.showMessageDialog(null, "La multiplicación es: " +  (x*y));
                break;
            case 4:
                // División
                JOptionPane.showMessageDialog(null, "La división es: " +  (x/y));
                break;
            case 5:
                // Potencia
                JOptionPane.showMessageDialog(null, "La potencia xy es: " +  Math.pow(x, y));
                break;
            case 6:
                // Logaritmo
                JOptionPane.showMessageDialog(null, "La multiplicación es: " +  Math.log(x));
                break;
            case 7:
                // Salir
                salir=true;
                   break;
            default:
                //Otros casos
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }

        // Salida

        // Fin
        System.exit(0);
    }
}