FROM gradle

COPY . /home/gradle

USER root
ENTRYPOINT ["gradle"]
CMD ["run"]
