--Oppgave 7a)
--Implikasjon finnes ikke i Haskell, så vi bygger den selv.
--Vi bruker loven A -> B er det samme som (ikke A) eller B.
--Funksjonen tar inn to sannhetsverdier og gir ut én.
implikasjon :: Bool -> Bool -> Bool
implikasjon p q = not p || q

main :: IO ()
main = do
  --Oppgave 7a)
  --Vi tester alle fire kombinasjoner for å sjekke sannhetstabellen
  putStrLn ("True  -> True  = " ++ show (implikasjon True True))
  putStrLn ("True  -> False = " ++ show (implikasjon True False))
  putStrLn ("False -> True  = " ++ show (implikasjon False True))
  putStrLn ("False -> False = " ++ show (implikasjon False False))

  putStrLn ""

  --Alternativt kan vi skrive ut hele tabellen med listekompresjon
  --Vi henter ut hver kombinasjon av p og q fra [True, False]
  let tabell = [(p, q, implikasjon p q) | p <- [True, False], q <- [True, False]]
  putStrLn ("Sannhetstabell: " ++ show tabell)