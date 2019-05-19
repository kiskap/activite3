package sudoku;

import org.junit.Assert;
import org.junit.Test;

/** Tests unitaire pour la classe Calcul **/
public class GrilleImplTest
{
    @Test
    public void testGetDimension()
    {
        Grille maGrille = new GrilleImpl(9);
        Assert.assertEquals(9,maGrille.getDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testgetValue()
    {
        Grille maGrille = new GrilleImpl(9);
        Assert.assertEquals(5,maGrille.getValue(4,7));
        maGrille.getValue(10, 7);
        
    }
}