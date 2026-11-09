"""Find velocity, acceleration, rest times and net displacement using SymPy."""
import sympy as sp


def main():
    t = sp.symbols("t", real=True)
    displacement = t**3 - 6 * t**2 + 9 * t + 5

    velocity = sp.diff(displacement, t)
    acceleration = sp.diff(velocity, t)

    print("Displacement s(t) =", displacement)
    print("Velocity v(t) = ds/dt =", velocity)
    print("Acceleration a(t) = dv/dt =", acceleration)

    rest_times = sp.solve(sp.Eq(velocity, 0), t)
    print("Vehicle is momentarily at rest at t =", rest_times)

    try:
        start = sp.sympify(input("\nEnter interval start time: "))
        end = sp.sympify(input("Enter interval end time: "))
        if not (start.is_number and end.is_number):
            raise ValueError("Enter numeric time values.")
        if float(end) < float(start):
            raise ValueError("End time must be greater than or equal to start time.")

        net_displacement = sp.integrate(velocity, (t, start, end))
        print(f"Net displacement from t={start} to t={end} =", net_displacement)
        print("Check using s(end) - s(start) =", sp.simplify(
            displacement.subs(t, end) - displacement.subs(t, start)
        ))
    except (ValueError, TypeError, sp.SympifyError) as error:
        print("Invalid time interval:", error)


if __name__ == "__main__":
    main()
