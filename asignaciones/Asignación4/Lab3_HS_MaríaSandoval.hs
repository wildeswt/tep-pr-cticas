-- Ejercicio 1
maxTres :: Ord a => a -> a -> a -> a
maxTres x y z = max x (max y z)

-- Ejercicio 2
interior :: [a] -> [a]
interior xs = tail (init xs)

-- Ejercicio 3
finales :: Int -> [a] -> [a]
finales n xs = drop (length xs - n) xs

-- Ejercicio 4
distancia :: Floating a => (a, a) -> (a, a) -> a
distancia (x1, y1) (x2, y2) = sqrt ((x2 - x1)^2 + (y2 - y1)^2)

-- Ejercicio 5
intercala :: [a] -> [a] -> [a]
intercala [a1, a2] [b1, b2] = [a1, b1, a2, b2]

-- Ejercicio 6
potencia :: Integer -> Integer -> Integer
potencia _ 0 = 1
potencia base exponente = base * potencia base (exponente - 1)

-- Ejercicio 7 
sumaListas :: [Int] -> Int
sumaListas [] = 0
sumaListas (x:xs) = x + sumaListas xs

-- Ejercicio 8
rango :: Ord a => [a] -> [a]
rango xs = [minimum xs, maximum xs]

-- Ejercicio 9
multiplica :: Num a => [a] -> a
multiplica [] = 1
multiplica (x:xs) = x * multiplica xs

-- Ejercicio 10
replica :: Int -> a -> [a]
replica 0 _ = []
replica n x = x : replica (n - 1) x

main :: IO ()
main = do
    putStrLn $ "Numero maximo entre 6, 2 y 4: " ++ show (maxTres 6 2 4)
    putStrLn $ "El interior de la lista [2,5,3,7,3]: " ++ show (interior [2,5,3,7,3])
    putStrLn $ "Ultimos 3 numeros de [2,5,4,7,9,6]: " ++ show (finales 3 [2,5,4,7,9,6])
    putStrLn $ "Distancia entre los puntos (1,2) y (4,6): " ++ show (distancia (1,2) (4,6))
    putStrLn $ "Intercalar listas [1,4] y [3,2]: " ++ show (intercala [1,4] [3,2])
    putStrLn $ "Potencia de 2^3 es: " ++ show (potencia 2 3)
    putStrLn $ "Suma de numeros en lista [2,3,5]: " ++ show (sumaListas [2,3,5])
    putStrLn $ "Rango de [3,2,7,5]: " ++ show (rango [3,2,7,5])
    putStrLn $ "Multiplicación de numeros en [2,5,3]: " ++ show (multiplica [2,5,3])
    putStrLn $ "Replicar 3 veces 2: " ++ show (replica 3 2)
