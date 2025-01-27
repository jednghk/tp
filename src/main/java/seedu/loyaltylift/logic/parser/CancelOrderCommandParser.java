package seedu.loyaltylift.logic.parser;

import static seedu.loyaltylift.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.loyaltylift.commons.core.index.Index;
import seedu.loyaltylift.logic.commands.CancelOrderCommand;
import seedu.loyaltylift.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new CancelOrderCommand object
 */
public class CancelOrderCommandParser implements Parser<CancelOrderCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the CancelOrderCommand
     * and returns a CancelOrderCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public CancelOrderCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new CancelOrderCommand(index);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, CancelOrderCommand.MESSAGE_USAGE), pe);
        }
    }
}
