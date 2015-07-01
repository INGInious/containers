FROM centos
ADD website /website
CMD cp -R /website /output && cp /input/yourfile /output/yourfile

# This container is a batch one
LABEL org.inginious.batch=1

#
# Some Metadata for the container
#
LABEL org.inginious.batch.title="Test Batch Container"
LABEL org.inginious.batch.description="A simple test backend container that put a simple website in its results."

# Course files
LABEL org.inginious.batch.args.course=file
LABEL org.inginious.batch.args.course.name="Course"
LABEL org.inginious.batch.args.course.path="course.tgz"
LABEL org.inginious.batch.args.course.description="The course files"

# Submissions
LABEL org.inginious.batch.args.submissions=file
LABEL org.inginious.batch.args.submissions.name="Submissions"
LABEL org.inginious.batch.args.submissions.path="submissions.tgz"
LABEL org.inginious.batch.args.submissions.description="All submissions made by students"

# Text
LABEL org.inginious.batch.args.text=text
LABEL org.inginious.batch.args.text.path="text.txt"
LABEL org.inginious.batch.args.text.name="A simple text field"
LABEL org.inginious.batch.args.text.description="Please enter something here (won't be used at all)"

# And a file
LABEL org.inginious.batch.args.file=file
LABEL org.inginious.batch.args.file.path="yourfile"
LABEL org.inginious.batch.args.file.name="Submit a file here"
LABEL org.inginious.batch.args.file.description="This file will be made available in the results as 'yourfile'"

