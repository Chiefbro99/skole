--Oppgave 7a)
--Implikasjon finnes ikke i Haskell, så vi bygger den selv.
--Vi bruker loven A -> B er det samme som (ikke A) eller B.
implikasjon :: Bool -> Bool -> Bool
implikasjon p q = not p || q

--Oppgave 7b)
--Formelen fra Q2 a): (P v Q) ^ (¬P v ¬Q)
--To variabler inn, én sannhetsverdi ut.
--Parentesene må være med, ellers binder && sterkere enn ||
formel :: Bool -> Bool -> Bool
formel p q = (p || q) && (not p || not q)

main :: IO ()
main = do
  --Oppgave 7a)
  putStrLn "Sannhetstabell for implikasjon:"
  mapM_ print [(p, q, implikasjon p q) | p <- [True, False], q <- [True, False]]

  putStrLn ""

  --Oppgave 7b)
  --Vi lager alle fire kombinasjoner av p og q og regner ut formelen for hver
  putStrLn "Sannhetstabell for (P v Q) ^ (¬P v ¬Q):"
  mapM_ print [(p, q, formel p q) | p <- [True, False], q <- [True, False]]