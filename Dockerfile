FROM gradle

COPY . /home/gradle

USER root
ENTRYPOINT ["bash"]
# CMD [""]
