package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.CartaMagica;
import modelo.CartaMonstruo;
import modelo.CartaTrampa;
import modelo.Tablero;

class YugiohTest {

	@Test
	void testColocarUnaCartaMonstruoEnEstadoOfensivo(){
		Tablero tablero = new Tablero();
		CartaMonstruo monstruo = new CartaMonstruo("bicho", 600, 900);//600 atk, 900 def
		tablero.agregarMonstruoEnEstadoOfensivo(monstruo);
		System.out.println(monstruo.getNombre());
		assertTrue(monstruo.estaEnEstadoOfensivo());	
	}
	
	@Test
	void testColocarUnaCartaMonstruoEnEstadoDefensivo() {
		Tablero tablero = new Tablero();
		CartaMonstruo monstruo = new CartaMonstruo("bicho", 600, 900);//600 atk, 900 def
		tablero.agregarMonstruoEnEstadoDefensivo(monstruo);
		
		assertTrue(monstruo.estaEnEstadoDefensivo());	
	}
	
	@Test
	void testColocarUnaCartaMagicaBocaAbajo() {
		CartaMagica cartaMagica = new CartaMagica();
		Tablero tablero = new Tablero();
		tablero.agregarBocaAbajo(cartaMagica);
		
		assertTrue(cartaMagica.estaBocaAbajo());
	}
	
	@Test
	void testColocarUnaCartaTrampaBocaAbajo() {
		CartaTrampa cartaTrampa = new CartaTrampa();
		Tablero tablero = new Tablero();
		tablero.agregarBocaAbajo(cartaTrampa);
		
		assertTrue(cartaTrampa.estaBocaAbajo());	
	}

}
