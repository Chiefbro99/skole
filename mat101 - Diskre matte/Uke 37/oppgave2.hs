main :: IO ()
main = do

    let a = [2, 3, 4, 5, 6, 7, 8, 9, 10]
    let b = [0, 3, 9]

    let s = [(x,y) | x <- -a, y <- -b, 2*x + y > 25]
    print s