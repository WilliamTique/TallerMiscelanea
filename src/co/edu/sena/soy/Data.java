package co.edu.sena.soy;

public class Data
{

    public double Calcularareatriangulo (double numero1, double numero2 )
    {
        return (numero1 * numero2 /2);
    }

    public double sumanumeros (double numero1, double numero2 )
    {
        return (numero1 + numero2);
    }

    public double Elevarnumero (double numero1)
    {
        return (numero1 * numero1);
    }

    public double Eurosdolares (double numero1)
    {
        return (numero1 * 1.09);
    }

    public double Areacuadrado (double numero1)
    {
        return (numero1 * numero1);
    }

    public double Perimetrocuadrado (double numero1)
    {
        return (numero1 * 4);
    }

    public double Areacilindro (double numero1, double numero2)
    {
        return ((2 * 3.1416 * numero2) * (numero2  + numero1));
    }

    public double Volumencilindro (double numero1, double numero2)
    {
        return ((3.1416 * (numero2 * numero2)) * numero1);
    }

    public double Longitudcircunferencia (double numero1)
    {
        return (2 * numero1 * 3.1416);
    }

    public double Areacirculo (double numero1)
    {
        return (3.1416 * (numero1 * numero1));
    }

    public double Promedionumeros (double numero1, double numero2, double numero3)
    {
        return ((numero1 + numero2 + numero3) /3);
    }
}
