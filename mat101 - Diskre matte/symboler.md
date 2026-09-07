# Symboler i MAT101

Rediger fritt. Formatet er en vanlig markdown-tabell:
`| symbol | leses som | betyr |`. En overskrift med `##` lager en gruppe.

Rekkefølgen her er rekkefølgen på sida. Det øverste er det du slår opp mest.

## tallmengder

| symbol | leses som | betyr |
|---|---|---|
| ℕ | naturlige tall | Telletallene: 1, 2, 3, 4, … Dette er tallene du bruker når du teller ting. Merk: noen bøker tar med 0, andre ikke — sjekk hva HVL bruker, det varierer |
| ℤ | hele tall | Telletallene, null, og alle de negative: …, −2, −1, 0, 1, 2, … Fortsatt ingen brøker eller desimaler |
| ℚ | rasjonale tall | Alt som kan skrives som en brøk p/q der p og q er hele tall og q ≠ 0. For eksempel 1/3, −1/2, 7/1, 0,25 (= 1/4). Merk at alle hele tall er rasjonale — 5 er jo 5/1. Bokstaven kommer av quotient, altså kvotient |
| ℝ | reelle tall | Alle tall på tallinja, uten hull. Det inkluderer de rasjonale, pluss de som ikke kan skrives som brøk: √2, π, e. Disse kalles irrasjonale, og desimalene deres fortsetter i det uendelige uten å gjenta seg i et mønster |
| ℂ | komplekse tall | De reelle tallene pluss de imaginære, skrevet a + bi |
| ℕ ⊂ ℤ ⊂ ℚ ⊂ ℝ | kjeden av tallmengder | Hver mengde ligger inni den neste. Et naturlig tall er også et helt tall, et rasjonalt tall og et reelt tall — men ikke omvendt |

## mengder

| symbol | leses som | betyr |
|---|---|---|
| ∈ | er element i · tilhører | medlemskap i en mengde |
| ∉ | er ikke element i | det motsatte av ∈ |
| ⊆ | er delmengde av | alt i A er også i B — de kan være like |
| ⊈ | er ikke delmengde av | minst ett element i A ligger utenfor B |
| ⊂ | er ekte delmengde av | som ⊆, men A er mindre enn B |
| ∪ | union | alt som er i A eller B eller begge |
| ∩ | snitt | bare det som er i både A og B |
| \ | mengdedifferanse | det i A som ikke er i B |
| ∅ | den tomme mengden | mengden uten elementer |
| ℘ | potensmengden | mengden av alle delmengder |
| \| A \| | kardinaliteten til A | hvor mange elementer A har |
| × | kartesisk produkt | alle par (a, b) med a fra A og b fra B |

## sammenligning

| symbol | leses som | betyr |
|---|---|---|
| < | mindre enn | strengt mindre — utelukker likhet |
| ≤ | mindre enn eller lik | «at most» i engelske oppgavetekster |
| > | større enn | strengt større — utelukker likhet |
| ≥ | større enn eller lik | «at least» i engelske oppgavetekster |
| ≠ | er ikke lik | de to er forskjellige |
| ≈ | er omtrent lik | tilnærming, ikke likhet |

## logikk

| symbol | leses som | betyr |
|---|---|---|
| ∀ | for alle | gjelder hvert eneste element, uten unntak |
| ∃ | det finnes | minst én finnes — ikke nødvendigvis bare én |
| ∃! | det finnes nøyaktig én | både at den finnes og at den er den eneste |
| ¬ | ikke | negasjon: snur sant til usant |
| ∧ | og | begge må være sanne |
| ∨ | eller | minst én må være sann (ikke enten-eller) |
| ⊕ | eksklusiv eller | sann når nøyaktig én av dem er sann |
| ⇒ | medfører | hvis venstre er sann, må høyre være det |
| ⇔ | hvis og bare hvis | begge veier — de er sanne samtidig |
| ≡ | er ekvivalent med | samme sannhetsverdi for alle tilfeller |

## tallteori og modulregning

| symbol | leses som | betyr |
|---|---|---|
| ∣ | deler | a ∣ b: a går opp i b uten rest. Merk: strek, ikke skråstrek |
| ∤ | deler ikke | a ∤ b: divisjonen gir en rest |
| a ≡ b (mod n) | a er kongruent med b modulo n | a og b gir samme rest når du deler på n. Samme tegn som logisk ekvivalens, men helt annen betydning — det er «(mod n)» som skiller dem |
| ≢ | er ikke kongruent med | ulik rest ved divisjon på n |

## relasjoner og funksjoner

| symbol | leses som | betyr |
|---|---|---|
| → | avbildes til | f: A → B går fra mengden A til mengden B |
| ↦ | sendes til | hva ett enkelt element blir til: x ↦ x² |
| ∘ | sammensatt med | f ∘ g betyr «gjør g først, så f» |

## summer og annet

| symbol | leses som | betyr |
|---|---|---|
| ∑ | sum | legg sammen alle leddene |
| ∏ | produkt | gang sammen alle faktorene |
| ∞ | uendelig | ikke et tall — en grense uten ende |
| ∴ | altså · derfor | konklusjonen følger av det over |

## fra engelsk setning til symbol

Pensum er på engelsk, og halve jobben er å oversette en setning til
symbolform. Her er retningen motsatt: du leter etter *setningen*, ikke tegnet.

| symbol | leses som | betyr |
|---|---|---|
| s > 0 | s is positive | «positiv» betyr større enn null |
| s < 0 | s is negative | mindre enn null — null selv er ingen av delene |
| s ≥ 0 | s is non-negative | null ELLER større. Ikke det samme som positiv |
| 1/s | the reciprocal of s | den resiproke er definisjonsmessig 1 delt på tallet |
| 1/s > 0 | the reciprocal of s is positive | samme oversettelse av «positiv» som over |
| → | if … then … | implikasjonspila. Noen bøker skriver ⇒ for det samme |
| ↔ | … if and only if … | begge veier. Skrives også ⇔ |
| ∀ | for every · for all · for each | alle tre er samme kvantor |
| ∃ | there exists · for some | «some» i matematikk betyr «minst én», ikke «noen få» |
| s ∣ t | s divides t | s går opp i t uten rest. Merk: strek, ikke skråstrek |
| 2 ∣ s | s is even | «partall» er definert som delelig med 2 |
| s = 2k + 1 | s is odd | oddetall skrives med en k du innfører selv |
| \| s \| | the absolute value of s | avstanden fra null, alltid positiv eller null |
| s ≠ t | s and t are distinct | «distinct» betyr forskjellige, ikke «tydelige» |
| s ≤ t | s is at most t | «at most» er ≤, ikke < |
| s ≥ t | s is at least t | «at least» er ≥, ikke > |
| a < s < b | s is strictly between a and b | «strictly» utelukker endepunktene |
