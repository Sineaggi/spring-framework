import org.springframework.context.index.processor.CandidateComponentsIndexer;

import javax.annotation.processing.Processor;

module spring.context.indexer {
    requires java.compiler;

	provides Processor with CandidateComponentsIndexer;
}
