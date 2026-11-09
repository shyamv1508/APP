"""TCP client: request a student's result using their register number."""
import socket

HOST = "127.0.0.1"
PORT = 5000


def main():
    register_number = input("Enter register number: ").strip()
    if not register_number:
        print("Register number cannot be empty.")
        return

    try:
        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client:
            client.connect((HOST, PORT))
            client.sendall(register_number.encode("utf-8"))
            result = client.recv(1024).decode("utf-8")
            print("Server response:", result)
    except ConnectionRefusedError:
        print("Could not connect. Start Q1_TCP_Server.py first.")
    except OSError as error:
        print("Network error:", error)


if __name__ == "__main__":
    main()
