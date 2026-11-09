"""Expand, factor, simplify expressions and solve a quadratic using SymPy."""
import sympy as sp


def main():
    x, y = sp.symbols("x y")

    expression = (x + 2 * y) ** 2
    print("Original expression:", expression)
    print("Expanded expression:", sp.expand(expression))

    polynomial = x**2 - 5 * x + 6
    print("\nPolynomial:", polynomial)
    print("Factorized expression:", sp.factor(polynomial))

    # Keep the fraction unevaluated so simplify() visibly performs the cancellation.
    unsimplified = sp.Mul(
        x**2 - 1, sp.Pow(x - 1, -1, evaluate=False), evaluate=False
    )
    print("\nExpression to simplify:", unsimplified)
    print("Simplified expression:", sp.simplify(unsimplified))

    equation = sp.Eq(x**2 - 5 * x + 6, 0)
    solutions = sp.solve(equation, x)
    print("\nQuadratic equation:", equation)
    print("Production quantity (solutions for x):", solutions)


if __name__ == "__main__":
    main()
