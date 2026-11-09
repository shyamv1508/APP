# Tutorial 11 - Python Networking, SymPy and Automata

## Programs

1. **Q1_TCP_Server.py / Q1_TCP_Client.py** - TCP result lookup by register number. The server uses a small sample dictionary; replace it with a database query when a real college database is available.
2. **Q2_UDP_Server.py / Q2_UDP_Client.py** - UDP temperature sender and receiver.
3. **Q3_SymPy_Algebra.py** - Expand, factor, simplify and solve a quadratic equation.
4. **Q4_SymPy_VehicleMotion.py** - Differentiate the displacement function and integrate velocity over a user-entered interval.
5. **Q5_DFA_BinaryCode.py** - DFA accepting binary strings ending in `01`.
6. **Q6_NFA_SubstringAB.py** - NFA accepting strings over `{a, b}` containing `ab`.

## Setup

Use Python 3. Install the third-party libraries from this folder:

```bash
python -m pip install -r requirements.txt
```

The socket programs use only Python's standard library.

## Run

Open two terminals for each networking exercise.

**Q1 - TCP**
1. Terminal 1: `python Q1_TCP_Server.py`
2. Terminal 2: `python Q1_TCP_Client.py`
3. Enter a sample register number such as `101`, `102`, `103`, or `20251001`.

**Q2 - UDP**
1. Terminal 1: `python Q2_UDP_Server.py`
2. Terminal 2: `python Q2_UDP_Client.py`
3. Enter temperature readings; enter `q` to stop the client.

Run Q3-Q6 individually with `python filename.py`.

## UDP suitability

UDP is connectionless and has lower communication overhead than TCP. Temperature readings are periodic sensor updates: a newer reading can often replace a lost older reading, so low latency and simple transmission can be more useful than guaranteed delivery. UDP does not guarantee delivery, ordering or duplicate protection. If every reading must be recorded reliably, add sequence numbers and acknowledgements/retransmission, or use TCP.

## DFA design (Q5)

- Start state: `q0`
- Accepting state: `q2`
- `q0`: on 0 -> q1, on 1 -> q0
- `q1`: on 0 -> q1, on 1 -> q2
- `q2`: on 0 -> q1, on 1 -> q0

The accepting state represents that the most recent two input symbols are `01`.

## NFA design (Q6)

- Start state: `q0`
- Accepting state: `q2`
- `q0` loops on both symbols and can also move to `q1` on `a`.
- `q1` moves to `q2` on `b`.
- `q2` loops on both symbols.

The NFA nondeterministically guesses where the substring `ab` begins.

## Notes

- Both socket examples use localhost (`127.0.0.1`) and fixed ports. Run the server before the client.
- For testing across different computers, change the client host to the server's reachable IP address and allow the selected port through the firewall.
- The sample result records are demonstration data, not actual student records.
