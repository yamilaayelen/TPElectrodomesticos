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
		 
		 CatalogoLavarropas catL = new CatalogoLavarropas();
		 listaLava = catL.getLavarropas();
		 
		 response.getWriter().println("LISTA DE ELECTRODOMESTICOS:");
		 response.getWriter().println("");
		 response.getWriter().println("");
		 
		 response.getWriter().println("LISTA DE LAVARROPAS:");
		 response.getWriter().println("");
		 response.getWriter().println("");
		 
		 for(int i=0; i<listaLava.size();i++)
			{
			 response.getWriter().println("Descripcion:" + listaLava.get(i).getDescrip());
			 response.getWriter().println("Precio :" + listaLava.get(i).getPrecioBase());
			 response.getWriter().println("Color:" + listaLava.get(i).getColor());
			 response.getWriter().println("Consumo Energetico:" + listaLava.get(i).getConsumoEnergetico());
			 response.getWriter().println("Peso:" + listaLava.get(i).getPeso());
			 response.getWriter().println("Carga:" + listaLava.get(i).getCarga());
			 
			 response.getWriter().println("");
			 response.getWriter().println("");
			}
		 
		 CatalogoTelevisores catT = new CatalogoTelevisores();
		 listaTele = catT.getTelevisores();
		 
		 response.getWriter().println("LISTA DE TELEVISORES:");
		 response.getWriter().println("");
		 response.getWriter().println("");
		 
		 for(int i=0; i<listaTele.size();i++)
			{
			 response.getWriter().println("Descripcion:" + listaTele.get(i).getDescrip());
			 response.getWriter().println("Precio :" + listaTele.get(i).getPrecioBase());
			 response.getWriter().println("Color:" + listaTele.get(i).getColor());
			 response.getWriter().println("Consumo Energetico:" + listaTele.get(i).getConsumoEnergetico());
			 response.getWriter().println("Peso:" + listaTele.get(i).getPeso());
			 response.getWriter().println("Resolución:" + listaTele.get(i).getResolucion());
			 response.getWriter().println("Sintonizador:" + listaTele.get(i).getSintonizadorTDT());
			 
			 response.getWriter().println("");
			 response.getWriter().println("");
			}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

	
}
