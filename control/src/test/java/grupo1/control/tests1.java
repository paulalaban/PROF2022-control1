package grupo1.control;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;
import org.mockito.Mockito;


//Cree una prueba de unidad 
//para la clase Matricula que verifique que se lanza una excepción cuando el vector de asignaturas es nulo.
public class tests1 {
	private double coste = 1.0;

	@Test(expected = Exception.class)
	public void test_Lanzar_Excepcion() throws Exception {
		Vector<Asignatura> vectorAsignaturas = null;
		Matricula mat = new Matricula(vectorAsignaturas);
		mat.getImporte();
	}



	@Test
	public void test2() throws Exception {
		
		Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>();    	
		Asignatura asignatura = Mockito.mock(Asignatura.class);
		Mockito.when(asignatura.getImporte()).thenReturn(coste);
	    vectorAsignaturas.add(asignatura);
	    Matricula mat = new Matricula(vectorAsignaturas);
	    assertEquals(1.0, mat.getImporte());

	}


		@Test
		public void test_3() throws Exception {
			Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>();
			Asignatura asig1 = Mockito.mock(Asignatura.class);
			Asignatura asig2 = Mockito.mock(Asignatura.class);
			Asignatura asig3 = Mockito.mock(Asignatura.class);
			Mockito.when(asig1.getImporte()).thenReturn(coste);
			Mockito.when(asig2.getImporte()).thenReturn(coste);
			Mockito.when(asig3.getImporte()).thenReturn(coste);
			vectorAsignaturas.add(asig1);
			vectorAsignaturas.add(asig2);
			vectorAsignaturas.add(asig3);
			Matricula mat = new Matricula(vectorAsignaturas);
			assertEquals(3.0, mat.getImporte());
		}
	}