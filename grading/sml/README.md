INGInious
=========

This container is part of [INGInious](https://github.com/UCL-INGI/INGInious), an intelligent grader that allows secured and automated testing of code made by students. 

SML container (ingi/inginious-c-sml)
------------------------------------

A container image containing SML/NJ.

SML is installed in `/usr/local/sml` with the executable at `/usr/local/sml/bin/sml` and symlinked to
`/usr/local/bin/sml` so you can type just `sml` and it will be in the path.

Contributed by [David H. Brown](mailto:david_h_brown@uri.edu).

There doesn't seem to be a yum package for sml, so I installed it the "hard way," first yum-installing gcc and 
the 32-bit libraries, then curl to get SML/NJ version 110.80 (will probably need to be updated in the future),
running the installer, and then removing things I was sure I no longer needed. I am new at making docker containers,
so suggestions for anything else I can/should clean up are very welcome. 
