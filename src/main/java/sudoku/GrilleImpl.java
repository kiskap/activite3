package sudoku;

/**
 * Implementation d'une grille
 */
public class GrilleImpl implements Grille {
    private int _dimension;
    private char[][] _grille;
    public GrilleImpl(int dimension){
        _dimension = dimension;
        _grille = new char[_dimension][_dimension];
    }
    @Override
    public int getDimension() {
        return _dimension;
    }

    @Override
    public void setValue(int x, int y, char value) throws IllegalArgumentException {
       
    }

    @Override
    public char getValue(int x, int y) throws IllegalArgumentException {
        if (x>=_dimension || y>= _dimension) {
            throw new  IllegalArgumentException();
        }
        return 5;
    }

    @Override
    public boolean complete() {
        return false;
    }

    @Override
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {
        return false;
    }
}
    
