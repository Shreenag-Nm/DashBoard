import React from 'react';
import { TextField, Grid, Paper } from '@mui/material';
import { makeStyles } from '@mui/styles';

const useStyles = makeStyles((theme) => ({
  paper: {
    padding: theme.spacing(2),
    margin: 'auto',
    maxWidth: 1000,
    textAlign: 'center',
    color: theme.palette.text.secondary,
  },
  formControl: {
    margin: theme.spacing(1),
    minWidth: 120,
  },
}));

const Filters = ({ onFilterChange }) => {
  const classes = useStyles();

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    onFilterChange(name, value);
  };

  return (
    <Paper className={classes.paper}>
      <Grid container spacing={3}>
        {/* Add any filters you need here */}
        <Grid item xs={12} sm={6} md={4}>
          <TextField
            label="Example Filter"
            name="exampleFilter"
            onChange={handleInputChange}
            fullWidth
            variant="outlined"
            margin="normal"
          />
        </Grid>
      </Grid>
    </Paper>
  );
};

export default Filters;
