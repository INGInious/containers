INGInious
=========

This container is part of [INGInious](https://github.com/UCL-INGI/INGInious), an
 intelligent grader that allows secured and automated testing of code made by st
udents.

SWI-Prolog container (ingi/inginious-c-prolog)
------------------------------------

A container image for [SWI-Prolog](http://www.swi-prolog.org/); downloads the current devel release, so may break unexpectedly.

With the current version (swipl-7.5.3; May 2017), SWI-Prolog is installed in `/usr/local/lib/swipl-7.5.3`,
and executables are in `usr/local/bin/`

Contributed by [David H. Brown](mailto:david_h_brown@uri.edu).

I think I cleaned up after installation pretty well, but I am new at making docker containers,
so suggestions for improvement up are very welcome.
Thanks, [anthonygego](https://github.com/anthonygego), for tips on how to make a more efficient Dockerfile.
