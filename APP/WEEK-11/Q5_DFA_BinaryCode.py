"""DFA that accepts binary strings ending with '01' (automata-lib)."""
from automata.fa.dfa import DFA


def main():
    dfa = DFA(
        states={"q0", "q1", "q2"},
        input_symbols={"0", "1"},
        transitions={
            "q0": {"0": "q1", "1": "q0"},
            "q1": {"0": "q1", "1": "q2"},
            "q2": {"0": "q1", "1": "q0"},
        },
        initial_state="q0",
        final_states={"q2"},
    )

    test_strings = ["01", "101", "1101", "0", "1", "10", "011", ""]

    print("DFA: accepts binary strings ending with '01'")
    for value in test_strings:
        try:
            status = "Accepted" if dfa.accepts_input(value) else "Rejected"
            print(f"{value!r}: {status}")
        except Exception as error:
            print(f"{value!r}: Rejected ({error})")

    # Optional interactive test.
    value = input("\nEnter a binary string to test: ").strip()
    if any(char not in "01" for char in value):
        print("Rejected: input must contain only 0 and 1.")
    else:
        print("Accepted" if dfa.accepts_input(value) else "Rejected")


if __name__ == "__main__":
    main()
