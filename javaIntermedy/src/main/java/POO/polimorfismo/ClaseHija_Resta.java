package POO.polimorfismo;

public class ClaseHija_Resta extends ClasePadre_Operaciones{


@Override
protected void operaciones(){
 result=valor1-valor2;
}

@Override
public void MostrarResultados(){
    System.out.println("La resta es " + result);
}
}
