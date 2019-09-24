package br.edu.univas;

import java.util.HashMap;
import java.util.Map;

public class ExpressionCache {

	private static ExpressionCache expression;
	
	private Map<String, Double> cache;
	
	private ExpressionCache() {
		cache = new HashMap();
	}
	
	public static ExpressionCache getInstance() {
		if (expression== null) {
			expression = new ExpressionCache();
		}
		return expression;
	}
	
	
	public void add(String expression, Double result) {
		cache.put(expression, result);
	}
	
	public Double get(String expression) {
		return cache.get(expression);
	}
	
}
