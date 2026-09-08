-- Q11: f : ℕ → ℕ, f(x) = 3x
f :: Integer -> Integer
f x = 3 * x

main :: IO ()
main = do
  -- Oppgave 6a)
  putStrLn "Oppgave6a)"
  let t = [1..99]
  print t
  putStrLn ""

  -- 6b)
  putStrLn "Oppgave6b)"
  let t1 = [ x | x <- t, x > 10, x < 20 ]
  print t1
  putStrLn ""

  -- 6c)
  putStrLn "Oppgave6c)"
  let t2 = [ (fromIntegral y + 3) / 2 | y <- t1 ] :: [Double]
  print t2
  putStrLn ""

  -- 8a) S x T
  putStrLn "Oppgave8a)"
  let s8 = [2, 4, 6]
      t8 = [1, 3, 5]
      st = [ (x, y) | x <- s8, y <- t8 ]
  print st
  putStrLn ("Antall: " ++ show (length st))
  putStrLn ""

  -- 8b) T x T
  putStrLn "Oppgave8b)"
  let tt = [ (x, y) | x <- t8, y <- t8 ]
  print tt
  putStrLn ("Antall: " ++ show (length tt))