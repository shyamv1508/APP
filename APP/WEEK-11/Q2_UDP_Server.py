"""UDP server: receive and display temperature readings."""
import socket

HOST = "127.0.0.1"
PORT = 5001


def main():
    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as server:
        server.bind((HOST, PORT))
        print(f"Temperature server listening on {HOST}:{PORT}")

        while True:
            data, address = server.recvfrom(1024)
            reading = data.decode("utf-8", errors="replace")
            print(f"Received from {address}: {reading}")


if __name__ == "__main__":
    try:
        main()
    except KeyboardInterrupt:
        print("\nServer stopped.")
