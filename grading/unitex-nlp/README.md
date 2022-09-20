INGInious
=========

This container is part of [INGInious](https://github.com/UCL-INGI/INGInious), an intelligent grader that allows secured and automated testing of code made by students. 

Container with the Unitex/GramLab NLP engine (ingi/inginious-c-unitex-nlp)
---------------------------------------------------------------------------------

A container with [Unitex/GramLab](https://www.unitexgramlab.org) installed. The container includes:
- the [Unitex/GramLab C++ Core](https://github.com/UnitexGramLab/unitex-core)
- the [Unitex/GramLab Language Resources](https://github.com/UnitexGramLab/unitex-lingua)

The container does NOT include the Unitex/GramLab IDE.

By default, Unitex v3.3 will be installed. You can install a different version with `--build-arg UNITEX_VERSION=<version>`.

To grade an assignment made with Unitex, you only need the `UnitexToolLogger` binary. This binary can be found in the `/home/unitex-core-${UNITEX_VERSION}/bin/` directory and can be used for:
- compiling the FSGraph (and possible subgraphs) (*.grf files);
- running the compiled FSGraph (and possible subgraphs) (*.fst2 files) on a given text document;
- etc.

You'll also need to specify which specific language resources to use. These language resources can be found in the `/home/unitex-lingua/` directory.

