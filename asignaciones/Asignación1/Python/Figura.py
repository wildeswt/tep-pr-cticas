from abc import ABC, abstractmethod

class Figura(ABC):
    @abstractmethod
    def calcularArea(self):
        pass

    @abstractmethod
    def calcularPerimetro(self):
        pass
        
class Rectangulo(Figura):
    # Constructor
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    # SET/GET
    def setBase(self, base):
        self.base = base

    def getBase(self):
        return self.base
    
    def setAltura(self, altura):
        self.altura = altura
    
    def getAltura(self):
        return self.altura
    
    # Metodos
    def calcularArea(self):
        return self.base * self.altura
        
    def calcularPerimetro(self):
        return 2 * (self.base + self.altura)
            
class Triangulo(Figura):
    # Constructor
    def __init__(self, base, altura, lado1, lado2):
        self.base = base
        self.altura = altura
        self.lado1 = lado1
        self.lado2 = lado2

    # SET/GET
    def setBase(self, base):
        self.base = base
    
    def getBase(self):
        return self.base
    
    def setAltura(self, altura):
        self.altura = altura

    def getAltura(self):
        return self.altura

    def setLado1(self, lado1):
        self.lado1 = lado1
    
    def getLado1(self):
        return self.lado1

    def setLado2(self, lado2):
        self.lado2 = lado2
    
    def getLado2(self):
        return self.lado2
    
    # Metodos   
    def calcularArea(self):
        return (self.base * self.altura) / 2
        
    def calcularPerimetro(self):
        return self.lado1 + self.lado2 + self.base

class Circulo(Figura):
    # Constructor
    def __init__(self, radio):
        self.radio = radio
    
    # SET/GET
    def setRadio(self, radio):
        self.radio = radio

    def getRadio(self):
        return self.radio
    
    # Metodos   
    def calcularArea(self):
        return 3.14159 * self.radio ** 2
        
    def calcularPerimetro(self):
        return 2 * 3.14159 * self.radio
            
# Implementación de las clases figuras:P
rectangulo = Rectangulo(base=5, altura=18)
print("Area del rectangulo:", rectangulo.calcularArea())
print("Perimetro del rectangulo:", rectangulo.calcularPerimetro())
            
triangulo = Triangulo(base=6, altura=9, lado1=5, lado2=6)
print("Area del triangulo:", triangulo.calcularArea())
print("Perimetro del triangulo:", triangulo.calcularPerimetro())
            
circulo = Circulo(radio=5)
print("Area del circulo:", circulo.calcularArea())
print("Perimetro del circulo:", circulo.calcularPerimetro())
