
public abstract class Piece {
	enum Color{
		BLANC,NOIR;
	}
	String idPiece;
	Color couleur;
	
	public abstract Boolean verifDeplacement(String a);
}
