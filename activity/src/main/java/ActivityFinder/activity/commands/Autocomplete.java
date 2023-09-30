package ActivityFinder.activity.commands;

import org.springframework.shell.CompletionContext;
import org.springframework.shell.CompletionProposal;
import org.springframework.shell.standard.ValueProvider;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Class to be used as ValueProvider for autocompletion in ShellOption
@Component
public class Autocomplete implements ValueProvider {

    @Override
    public List<CompletionProposal> complete(CompletionContext completionContext) {
        return Arrays.asList("education",
                "recreational",
                "social",
                "diy",
                "charity",
                "cooking",
                "relaxation",
                "music",
                "busywork").stream()
                .map(CompletionProposal::new)
                .collect(Collectors.toList());
    }
}
