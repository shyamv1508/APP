"""TCP server: look up student results by register number."""
import socket

HOST = "127.0.0.1"
PORT = 5000

# Sample data; replace these entries with the college database lookup.
STUDENT_RESULTS = {
    "101": "Pass - CGPA: 8.4",
    "102": "Pass - CGPA: 9.1",
    "103": "Arrear in Mathematics",
    "20251001": "Pass - CGPA: 8.7",
}


def main():
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server:
        server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        server.bind((HOST, PORT))
        server.listen()
        print(f"Result server listening on {HOST}:{PORT}")

        while True:
            connection, address = server.accept()
            with connection:
                print("Connected by", address)
                register_number = connection.recv(1024).decode("utf-8").strip()
                result = STUDENT_RESULTS.get(
                    register_number, "No result found for this register number."
                )
                connection.sendall(result.encode("utf-8"))
                print(f"Request: {register_number} | Response: {result}")


if __name__ == "__main__":
    try:
        main()
    except KeyboardInterrupt:
        print("\nServer stopped.")
