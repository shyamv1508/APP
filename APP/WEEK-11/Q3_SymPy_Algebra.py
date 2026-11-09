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

    unsimplified = (x**2 - 1) / (x - 1)
    print("\nExpression to simplify:", unsimplified)
    print("Simplified expression:", sp.simplify(unsimplified))

    equation = sp.Eq(x**2 - 5 * x + 6, 0)
    solutions = sp.solve(equation, x)
    print("\nQuadratic equation:", equation)
    print("Production quantity (solutions for x):", solutions)


if __name__ == "__main__":
    main()
