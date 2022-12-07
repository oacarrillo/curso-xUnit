const calculator = require('./calculator.js')
test('suma calculator', ()=>{
    const result = calculator.suma(1,2);
    expect(result).toBe(3);
});

test('asignación de un objeto', () => {
    const datos = {uno: 1};
    datos['dos'] = 2;
    expect(datos).toEqual({uno: 1, dos: 2});
  });

  test('null', () => {
    const n = null;
    expect(n).toBeNull();
    expect(n).toBeDefined();
    expect(n).not.toBeUndefined();
  });

  test('hay "stop" en Christoph', () => {
    expect('Christoph').toMatch(/stop/);
  });

  const listaDeCompras = [
    'pañales',
    'pañuelos',
    'bolsas de basura',
    'toallas de papel',
    'leche',
  ];
  
  test('la leche se encuentra en la lista de compras', () => {
    expect(listaDeCompras).toContain('leche');
    expect(new Set(listaDeCompras)).toContain('leche');
  });

  test('compiling android goes as expected', () => {
    expect(() => compileAndroidCode()).toThrow();
    expect(() => compileAndroidCode()).toThrow(Error);
});