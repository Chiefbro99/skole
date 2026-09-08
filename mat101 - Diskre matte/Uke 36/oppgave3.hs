main :: IO ()
main = do
  let a = [0, 2, 4]
  let b = [1, 3, 5]
  
  --Oppgave 3b)
  let r = [[0,1], [0,3], [2,5]]
  putStrLn ("Elemener fra r: " ++ show r)
  
  putStrLn ""
      
  --Alternativt:
  let r2 = [[x,y] | x <- a, y <- b, [x,y] `elem` r]
  putStrLn ("Listekompresjon: " ++ show r2)
  
  --Oppgave 3c)
  --Lag en liste med par [y, x], for hvert par [x, y] som finnes i r.
  --[y, x] Snu dette paret rundt til [y, x], og legg det inn i den nye listen.
  --[x, y] <- r Hent ut et og et par, som vi kaller [x, y], fra listen r
  let r_invers = [[y, x] | [x, y] <- r]
  putStrLn ("Invers relasjon: " ++ show r_invers)
  
  putStrLn ""
  
  --Oppgave 3d)
  -- Vi definerer tallene fra 0 til 100
  let tall = [0..100]
  -- Vi finner alle par der produktet er lik 0
  let r_null = [[x, y] | x <- tall, y <- tall, x * y == 0]
  putStrLn ("Relasjon d: " ++ show r_null)
  
  --Alternativt kan vi skrive
  --let tall = [0..100]
  --let r_null = [[x, y] | x <- tall, y <- tall, x == 0 || y == 0]
  
  --ELLER
  --let tall = [0..100]
  -- Vi limer sammen listen der x=0 med listen der y=0
  -- let r_null = [[0, y] | y <- tall] ++ [[x, 0] | x <- [1..100]]
  
  --ELLER
  --let r_null = [[x, y] | x <- [0..100], y <- [0..100], x * y == 0]
