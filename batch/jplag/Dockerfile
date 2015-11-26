FROM centos

RUN yum install -y maven git && \
    echo "clean_requirements_on_remove=1" >> /etc/yum.conf && \
    git clone https://github.com/jplag/jplag.git /jplag_src && \
    cd /jplag_src/jplag && \
    mvn clean generate-sources assembly:assembly && \
    mv target/jplag-*-jar-with-dependencies.jar /jplag.jar && \
    cd / && \
    rm -Rf /jplag_src && \
    yum -y remove maven git && \
    yum -y install java-1.7.0-openjdk unzip

ADD ./runcmd /
RUN chmod +x /runcmd
CMD "/runcmd"

# This container is a batch one
LABEL org.inginious.batch=1

#
# Some Metadata for the container
#
LABEL org.inginious.batch.title="JPlag" \
      org.inginious.batch.description="An automated tool that checks submissions for plagiarism. "

# Submissions
LABEL org.inginious.batch.args.submissions=file \
      org.inginious.batch.args.submissions.name="Submissions" \
      org.inginious.batch.args.submissions.path="submissions.tgz" \
      org.inginious.batch.args.submissions.description="All submissions made by students" \
      org.inginious.batch.args.submissions.folder_format="taskid/username" \
      org.inginious.batch.args.submissions.best_only="1" \
      org.inginious.batch.args.submissions.task="task"

# Course files
LABEL org.inginious.batch.args.course=file \
      org.inginious.batch.args.course.name="Course" \
      org.inginious.batch.args.course.path="course.tgz" \
      org.inginious.batch.args.course.description="The course files"

# Task
LABEL org.inginious.batch.args.task=text \
      org.inginious.batch.args.task.name="Task to check" \
      org.inginious.batch.args.task.path="task.txt" \
      org.inginious.batch.args.task.description="Id of the task you want to check."

# Old submissions
LABEL org.inginious.batch.args.old_submissions=file \
      org.inginious.batch.args.old_submissions.name="Old submissions" \
      org.inginious.batch.args.old_submissions.path="old_submissions.tgz" \
      org.inginious.batch.args.old_submissions.description="Submissions made previous years (field not mandatory). The archive must be in the same \
format as submissions returned by INGInious (for example, for a taskid named taskid and a user called username, the files must be located in \
``taskid/username/submissionid/archives``). For compatibility reasons, it is also possible to have only a scheme like ``username/``"

# Additionnal infos
LABEL org.inginious.batch.args.args=text \
      org.inginious.batch.args.args.name="Additionnal arguments to JPlag" \
      org.inginious.batch.args.args.path="args.txt" \
      org.inginious.batch.args.args.description="Additionnal arguments for JPlag.\n\n\
You can reference to file contained in your task directory using \
the path ``/input/course/taskid/yourfile``. For example, to use the exclude file named ``my_exclude.txt`` that you place inside the task \
``my_task``, put ``-x /input/course/my_task/my_exclude.txt`` \n\
\n\
\n\
\n\
Please note that by default, ``jplag_exclude.txt`` will be used if it exists as exclude file. If you \
leave this field empty, the container will also search in the file ``jplag_args.txt`` for additionnal arguments."

# Language
LABEL org.inginious.batch.args.language=text \
      org.inginious.batch.args.language.name="Language" \
      org.inginious.batch.args.language.path="lang.txt" \
      org.inginious.batch.args.language.description="Language used in the submissions. Can be 'java17' (default), 'java15', 'java15dm', 'java12', \
'java11', 'c/c++', 'c#-1.2', 'char', 'text' or 'scheme'. If you leave this field empty, the container will look at the file ``jplag_lang.txt`` \
inside you task folder to get the language."

# Base code
LABEL org.inginious.batch.args.template=text \
      org.inginious.batch.args.template.name="Base code" \
      org.inginious.batch.args.template.path="template.txt" \
      org.inginious.batch.args.template.description="Base code (code shared between all the submissions). You should indicate a path relative to \
      your course directory (likely ``taskid/jplag_basecode`` ; this is the default)."
