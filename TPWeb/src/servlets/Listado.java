package servlets;


import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tp.*;
import datos.*;

/**
 * Servlet implementation class Listado
 */
@WebServlet("/Listado")
public class Listado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static ArrayList<Lavarropas> listaLava = new ArrayList<Lavarropas>();
	static ArrayList<Television> listaTele = new ArrayList<Television>();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().print("Hola");
		
		CatalogoLavarropas catL = new CatalogoLavarropas();
		listaLava = catL.getLavarropas();
		
		
		for(int i=0; i<listaLava.size();i++)
		{
			response.getWriter().print(listaLava.get(i));
		}
		
		CatalogoTelevisores catT = new CatalogoTelevisores();
		listaTele = catT.getTelevisores();
		
		
		for(int i=0; i<listaTele.size();i++)
		{
			response.getWriter().print(listaTele.get(i));
		}
		
		
		response.getWriter().print("fin");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
		}
	}

}
