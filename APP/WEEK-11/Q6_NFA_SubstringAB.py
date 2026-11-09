"""NFA that accepts strings over {a, b} containing the substring 'ab'."""
from automata.fa.nfa import NFA


def main():
    nfa = NFA(
        states={"q0", "q1", "q2"},
        input_symbols={"a", "b"},
        transitions={
            "q0": {"a": {"q0", "q1"}, "b": {"q0"}},
            "q1": {"b": {"q2"}},
            "q2": {"a": {"q2"}, "b": {"q2"}},
        },
        initial_state="q0",
        final_states={"q2"},
    )

    test_strings = ["ab", "aab", "bab", "baba", "ba", "aaa", "bbb", ""]

    print("NFA: accepts strings containing the substring 'ab'")
    for value in test_strings:
        try:
            status = "Accepted" if nfa.accepts_input(value) else "Rejected"
            print(f"{value!r}: {status}")
        except Exception as error:
            print(f"{value!r}: Rejected ({error})")

    # Optional interactive test.
    value = input("\nEnter a string using only a and b: ").strip()
    if any(char not in "ab" for char in value):
        print("Rejected: input must contain only a and b.")
    else:
        print("Accepted" if nfa.accepts_input(value) else "Rejected")


if __name__ == "__main__":
    main()
