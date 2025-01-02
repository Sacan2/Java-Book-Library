FROM ubuntu:latest
LABEL authors="serha"

ENTRYPOINT ["top", "-b"]